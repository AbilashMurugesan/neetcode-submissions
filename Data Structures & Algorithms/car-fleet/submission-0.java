class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Car[] cars=new Car[n];
        for(int i=0;i<n;i++){
            cars[i]=new Car(position[i],speed[i]);
        }
        Comparator<Car> comp=(c1,c2)->Integer.compare(c1.position,c2.position);
        Arrays.sort(cars,comp);
        double[] time=new double[n];
        for(int i=0;i<n;i++){
            int p=cars[i].position;
            int s=cars[i].speed;

            // dis=time*speed
            // time=dis/speed
            double distance=target-p;
            time[i]=distance/s;
        }
        // Arrays.sort(time);
        double maxSpeed=0;
        int fleet=0;
        for(int i=n-1;i>=0;i--){
            // System.out.println(time[i]);
            if(maxSpeed<time[i]){
                fleet++;
                maxSpeed=time[i];
            }
        }
        return fleet;
    }
}
class Car{
    int position;
    int speed;
    public Car(int position,int speed){
        this.position=position;
        this.speed=speed;
    }
}
