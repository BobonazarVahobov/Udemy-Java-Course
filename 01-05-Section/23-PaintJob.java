public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double bucketsToBuy = (((width * height) / areaPerBucket) - extraBuckets);
        return (int) Math.ceil((double) bucketsToBuy);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double bucketsToBuy = ((width * height) / areaPerBucket);
        return (int) Math.ceil((double) bucketsToBuy);
    }

    public static int getBucketCount( double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0) return -1;

        double bucketsToBuy = (area / areaPerBucket);
        return (int) Math.ceil((double) bucketsToBuy);
    }



}
