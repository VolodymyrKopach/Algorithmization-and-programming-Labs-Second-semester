from accommodation import Accommodation


class Penthouse(Accommodation):
    def __init__(self, number_of_rooms, price, area, latitude, basin):
        super(Penthouse, self).__init__(number_of_rooms, price, area, latitude)
        self.basin = basin

    def __str__(self):
        return super(Penthouse, self).__str__() + " basin = " + str(self.basin)