// EXT:SPILL

class SpillingSample {
    public static void main(String[] args) {
        System.out.println(
            new SpillingClass().run(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                    11, 12, 13, 14, 15, 16));
    }
}

class SpillingClass {
    public int run(int x1, int x2, int x3, int x4, int x5, int x6, int x7,
                   int x8, int x9, int x10, int x11, int x12, int x13,
                   int x14, int x15, int x16) {
        return x1 * (x2 - x3 + x4) + x5 * (x6 * x7 - x8 - x9) + x10 +
            x11 * ((x12 - x13) * x14 + x15) - 16;
    }
}
