List<Integer> fibonacciSeries = new ArrayList<>();
        int a = 0, b = 1;

        while (a <= N) {
            fibonacciSeries.add(a);

            int c = a + b;
            a = b;
            b = c;
        }

        return fibonacciSeries;
