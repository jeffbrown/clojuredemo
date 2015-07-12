package demo

class MathController {

    static allowedMethods = [addNumbers: 'POST']
    
    def add() {}

    def addNumbers(int x, int y) {
        def sum = clj.add_numbers(x, y)

        [sum: sum, x: x, y: y]
    }
}
