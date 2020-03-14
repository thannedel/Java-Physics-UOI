public class FreeFall {
    public static void main(String[] arguments)
    {
        double g = 9.81;
        double time =1.;
        double distance = 0.5*g*Math.pow(time,2);
        double speed = g*time ;
        System.out.println(("For time= " + time + " sec, distance = "+ distance + " m"));
        System.out.println(("For time= " + time + " sec, speed = "+ speed + " m/sec"));
    }}
