from app.accommodation import Accommodation


class PersonalHome(Accommodation):
    def __init__(self, number_of_rooms, price, area, latitude, number_of_floors):
        super(PersonalHome, self).__init__(number_of_rooms, price, area, latitude)
        self.number_of_floors = number_of_floors

    def __str__(self):
        return super(PersonalHome, self).__str__() + ' number of floors = ' \
               + str(self.number_of_floors)