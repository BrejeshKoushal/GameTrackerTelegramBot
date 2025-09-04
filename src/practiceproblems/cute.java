    package practiceproblems;

    interface Emploee{
        public void getDetails(int Empid , String Ename);
    }
    interface Managerbabu extends Emploee{
       public void deptdet(int Deptid , String Deptname);
    }
    class Headbabu implements Managerbabu{
        int Empid;
        String Ename;
        int Deptid;
        String Deptname;
     @Override
        public void getDetails(int Empid , String Ename){
            this.Empid=Empid;
            this.Ename = Ename;
        }
        @Override
      public void deptdet(int Deptid , String Deptname){
         this.Deptid = Deptid;
         this.Deptname = Deptname;

        }
    }


    public class cute {
        public static void main(String[] args) {
            Headbabu obj = new Headbabu();
            obj.getDetails(1,"Brejesh");
            obj.deptdet(2,"CSE");

        }
    }
