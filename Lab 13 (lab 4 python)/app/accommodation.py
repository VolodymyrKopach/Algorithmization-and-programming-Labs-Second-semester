class Accommodation:

    def __init__(self, number_of_rooms, price, area, latitude):
        self.number_of_rooms = number_of_rooms
        self.price = price
        self.area = area
        self.latitude = latitude

    def __str__(self):
        return ' number of rooms = ' + str(self.number_of_rooms) + ' price = ' \
               + str(self.price) + ' area = ' + str(self.area) +\
               ' latitude = ' + str(self.latitude)