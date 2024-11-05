package BinarySearch;

public class UglyNumber3 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long prod = a;
        long n1 = 0, l = 0, r;
        while (n1 < n) {
            prod *= 2;
            n1 = getNforNumber(prod, a, b, c);
            System.out.println("n1 " + n1 + "prod " + prod);
        }
        if (n1 == n) {
            System.out.println("prod " + prod);
            return (int) prod;
        } else {
            l = a;
            r = prod;

            while (l < r) {
                long mid = l + (r - l) / 2;
                n1 = getNforNumber(mid, a, b, c);
                System.out.println("n1 " + n1 + "mid " + mid);
                if (n1 >= n) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return (int) l;
    }

    public int getNforNumber(long num, int a, int b, int c) {
        long result = num / a + num / b + num / c - num / lcm(a, b) - num / lcm(b, c) - num / lcm(a, c) + num / lcm(a, b, c);
        return (int) result;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int lcm(int a, int b, int c) {
        int lcm_ab = lcm(a, b);
        return lcm(lcm_ab, c);
    }
}
