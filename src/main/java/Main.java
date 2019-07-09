public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f,3.0f);
        String str1 = point2D.toString();
        System.out.println(str1);

        System.out.println("-----------------------");

        Point3D point3D = new Point3D(2.0f,3.0f,4.0f);
        String str2 = point3D.toString();
        System.out.println(str2);
    }
}
