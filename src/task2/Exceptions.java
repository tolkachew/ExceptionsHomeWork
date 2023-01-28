package task2;
/*
Создать метод, принимающий на вход число. В случае,
если число отрицательное, в методе должно быть брошено
проверяемое исключение. Если число больше 100, должно
быть брошено непроверяемое исключение. Создать свои исключения для данного примера.
Протестируйте метод с помощью JUnit-тестов
 */
public class Exceptions {
    public void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Отрицательное число не допускается: " + number);
        } else if (number > 100) {
            throw new LargeNumberException("Слишком большое число " + number);
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class LargeNumberException extends RuntimeException {
    public LargeNumberException(String message) {
        super(message);
    }
}