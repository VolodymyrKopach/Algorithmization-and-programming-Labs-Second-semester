from operator import attrgetter


class SalesManager:

    accommodationList = []

    def find_accommodation_by_price(price, accommodation_list):
        found_accommodation_by_price = []
        for accommodation in accommodation_list:
            if accommodation.price < price:
                found_accommodation_by_price.append(accommodation)
        return found_accommodation_by_price

    def find_by_distance(accommodation_list, location_of_sio, distance):
        found_accommodation_by_distance = []
        for accommodation in accommodation_list:
            if (accommodation.latitude - location_of_sio) < distance:
                found_accommodation_by_distance.append(accommodation)

        return found_accommodation_by_distance

    def sort_accommodation_by_price(accommodation_list):
        return sorted(accommodation_list, key=attrgetter('price'))