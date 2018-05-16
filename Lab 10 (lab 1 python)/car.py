class Car:
    total_number_of_wheels = 0

    def __init__(self, number_of_wheels=4, capacity_of_passegers=2, fuel_consumption=1.2, gearbox="auto",
                 maximum_speed=120):
        self.number_of_wheels = number_of_wheels
        self.capacity_of_passengers = capacity_of_passegers
        self.fuel_consumption = fuel_consumption
        self.gearbox = gearbox
        self.maximum_speed = maximum_speed
        Car.total_number_of_wheels += number_of_wheels


    def toString(self):
        print("number of whells = ", self.number_of_wheels, " capacity of passengers = ", + self.capacity_of_passengers,
              "fuel consumption = ", self.fuel_consumption, " gearbox = " + self.gearbox, " maximum_speed =",
              self.maximum_speed)


    def printSum(self):
        print("total_number_of_wheels = ", Car.total_number_of_wheels)

    @staticmethod
    def printStaticSum():
        print("total_number_of_wheels = ", Car.total_number_of_wheels)


if __name__ == '__main__':
    bmw = Car()
    audi = Car(4, 4, 2, "auto")
    opel = Car(4, 8, 4, "auto", 500)

    bmw.toString()
    bmw.printSum()

    audi.toString()
    audi.printSum()

    opel.toString()
    opel.printSum()

    Car.printStaticSum()

