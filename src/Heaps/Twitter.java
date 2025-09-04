package Heaps;

import java.util.*;

public class Twitter {
    PriorityQueue<Integer> pq;
    Map<Integer,Set<Integer>> followingMap;
    Map<Integer,List<int[]>> tweetsMap;

    int time;

    public Twitter() {
        time = 0;
        followingMap = new HashMap<>();
        tweetsMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        ++time;
        List<int[]> list = tweetsMap.getOrDefault(userId , new ArrayList<>());
        list.add(new int[]{time,tweetId});
        tweetsMap.put(userId,list);
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((arr1,arr2)->arr2[0]-arr1[0]);
        if (tweetsMap.containsKey(userId)){
            for (int[] arr : tweetsMap.get(userId)){
                pq.offer(arr);
            }
        }
        if (followingMap.containsKey(userId)){
            for (int followee : followingMap.get(userId)){
                if (tweetsMap.containsKey(followee)){
                    for (int[] arr : tweetsMap.get(followee)){
                        pq.offer(arr);
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty() && ans.size()<10){
            int[] arr = pq.poll();
            ans.add(arr[1]);
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> set = followingMap.getOrDefault(followerId,new HashSet<>());
        set.add(followeeId);
        followingMap.put(followerId,set);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = followingMap.getOrDefault(followerId,new HashSet<>());
        set.remove(followeeId);
        followingMap.put(followerId,set);
    }
}

