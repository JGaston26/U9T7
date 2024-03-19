public class Main {
    public static void main(String[] args) {
        ThreeDPoint pointF = new ThreeDPoint("F", 12, -3, 8);
        ThreeDPoint pointG = new ThreeDPoint("G", 12, -3, 8);
        ThreeDPoint pointH = new ThreeDPoint("H", 12, -3, 4);
        ThreeDPoint pointI = new ThreeDPoint("I", 10, -3, 8);
        ThreeDPoint pointJ = new ThreeDPoint("J", 10, 15, 8);

        System.out.println(pointF);
        System.out.println(pointG);
        System.out.println(pointH);
        System.out.println(pointI);
        System.out.println(pointJ);

        System.out.println(pointF.equals(pointG));
        System.out.println(pointG.equals(pointH));
        System.out.println(pointG.equals(pointI));
        System.out.println(pointH.equals(pointI));
        System.out.println(pointI.equals(pointJ));
        System.out.println(pointI.equals(new Point("K", 10, -3)));
        System.out.println(pointF.equals("hello"));
        System.out.println(pointF.equals(null));
        Polygon poly2 = new Polygon(4);
        System.out.println(pointF.equals(poly2));
    }
}
