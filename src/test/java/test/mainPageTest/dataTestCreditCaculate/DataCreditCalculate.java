package test.mainPageTest.dataTestCreditCaculate;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface DataCreditCalculate {
    static Stream<Arguments> dataForTheCreditCalculator() {
        return Stream.of(
                Arguments.of(50_000, 1, 1, 12, 1),
                Arguments.of(50_000, 2, 2, 24, 1),
                Arguments.of(50_000, 3, 3, 36, 1),
                Arguments.of(50_000, 4, 4, 48, 1),
                Arguments.of(50_000, 5, 5, 60, 2),
                Arguments.of(3_000_000, 1, 1, 12, 1),
                Arguments.of(3_000_000, 2, 2, 24, 1),
                Arguments.of(3_000_000, 3, 3, 36, 1),
                Arguments.of(3_000_000, 4, 4, 48, 1),
                Arguments.of(3_000_000, 5, 5, 60, 2),
                Arguments.of(7_500_000, 1, 1, 12, 1),
                Arguments.of(7_500_000, 2, 2, 24, 1),
                Arguments.of(7_500_000, 3, 3, 36, 1),
                Arguments.of(7_500_000, 4, 4, 48, 1),
                Arguments.of(7_500_000, 5, 5, 60, 2)
        );
    }
}
