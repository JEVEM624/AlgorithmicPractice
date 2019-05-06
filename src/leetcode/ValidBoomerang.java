package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/5/5
 * @Version 1.0
 */
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        double x=Math.sqrt(Math.pow(points[1][0]-points[0][0],2)+Math.pow(points[1][1]-points[0][1],2));
        double y=Math.sqrt(Math.pow(points[2][0]-points[0][0],2)+Math.pow(points[2][1]-points[0][1],2));
        double z=Math.sqrt(Math.pow(points[2][0]-points[1][0],2)+Math.pow(points[2][1]-points[1][1],2));
        if (x+y>z&&z+y>x&&x+z>y&&x!=0&&y!=0&&z!=0){
            return true;
        }
        return false;
    }
}
