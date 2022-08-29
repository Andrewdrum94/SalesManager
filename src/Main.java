public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new long[]{});
        long max = salesManager.max();
        System.out.println(max);
        long min = salesManager.min(max);
        long sum = 0;
        for (long s: salesManager.sales) {
            sum += s;
        }
        int length = salesManager.sales.length;
        System.out.println(salesManager.mediumCropped(min, max, sum, length));
    }

}
