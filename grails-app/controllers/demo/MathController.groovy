package demo

class MathController {

    static allowedMethods = [addNumbers: 'POST']

    def mathHelper

    def add() {}

    def addNumbers(int x, int y) {
        def sum = mathHelper.add_numbers(x, y)

        [sum: sum, x: x, y: y]
    }
}
