from app.accommodation import Accommodation


class Apartment(Accommodation):

    def __init__(self, number_of_rooms, price, area, latitude, floor_of_house):
        super(Apartment, self).__init__(number_of_rooms, price, area, latitude)
        self.floor_of_house = floor_of_house

    def __str__(self):
        return super(Apartment, self).__str__() + ' floor_of_house = ' \
               + str(self.floor_of_house)