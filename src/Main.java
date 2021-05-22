
public class Main {
    public static class Rectangle{
        public double width = 1;
        public double height = 2;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

         public double getArea(){
             return width * height;
        }
        public double getPerimeter(){
            return 2 * (width + height);
        }

    }



    public static void main(String[] args) {
        System.out.println("My name is Vintavious Gilbert, and I'm in data structures for Fall 2020");

        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.7);

        System.out.println("Width rectangle 1 is: " + rectangle1.width);
        System.out.println("height rectangle 1 is: " + rectangle1.height);
        System.out.println("area rectangle 1 is: " + rectangle1.getArea());
        System.out.println("perimeter rectangle 1 is: " + rectangle1.getPerimeter());

        System.out.println("=====================");

        System.out.println("Width rectangle 2 is: " + rectangle2.width);
        System.out.println("height rectangle 2 is: " + rectangle2.height);
        System.out.println("area rectangle 2 is: " + rectangle2.getArea());
        System.out.println("perimeter rectangle 2 is: " + rectangle2.getPerimeter());
        System.out.println( fib(5));


    }

      public static int fib(int n){

        if (n == 0 || n == 1) { // base cases (in this case when n = 0 or n = 1 )

            return 1; //

        }

        return fib(n - 1) + fib(n -2);  // recursive calls (two calls in this case, always towards a smaller version of the problem.

    }


    public boolean isEverywhere(int[] nums, int val){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == val && nums[i + 1] == val){
                return true;
            }
        }
        return false;
    }

}

