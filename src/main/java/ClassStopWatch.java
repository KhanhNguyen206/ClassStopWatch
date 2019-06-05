public class ClassStopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public ClassStopWatch(){
    }

    public long start(){
        this.startTime= System.currentTimeMillis();
        return this.startTime;
    }
    public long stop(){
        this.endTime= System.currentTimeMillis();
        return  this.endTime;
    }

    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        ClassStopWatch classStopWatch = new ClassStopWatch();

        long [] arr= new long[10000];

        for (int i=0; i<arr.length; i++){
            arr[i]= Math.round(Math.random()*10000);
        }

        System.out.println(classStopWatch.start());

        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    long x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }

        System.out.println(classStopWatch.stop());
        System.out.println(classStopWatch.getElapsedTime());
    }
}
