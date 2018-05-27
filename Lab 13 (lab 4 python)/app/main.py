from app.apartment import Apartment
from app.penthouse import Penthouse
from app.personal_home import PersonalHome
from app.sales_manager import SalesManager
from app.list_location_of_SIO import ListLocationOfSIO


if __name__ == '__main__':
    my_sales_manager = SalesManager
    my_sales_manager.accommodationList.append(Apartment(2, 400, 40, 20, 100))
    my_sales_manager.accommodationList.append(Apartment(1, 200, 80, 10, 500))
    my_sales_manager.accommodationList.append(PersonalHome(8, 400, 50, 2000, 300))
    my_sales_manager.accommodationList.append(PersonalHome(3, 350, 40, 200, 100))
    my_sales_manager.accommodationList.append(Penthouse(8, 200, 60, 1000, True))
    my_sales_manager.accommodationList.append(Penthouse(9, 120, 50, 15, False))

    my_sales_manager.accommodationList = my_sales_manager.\
        find_accommodation_by_price(300, my_sales_manager.accommodationList)
    for accommodation in my_sales_manager.accommodationList:
        print(accommodation.__str__())

    print('\n')

    my_sales_manager.accommodationList = my_sales_manager.\
        find_by_distance(my_sales_manager.accommodationList
                         , ListLocationOfSIO.school.value.latitude, 300)
    for accommodation in my_sales_manager.accommodationList:
        print(accommodation.__str__())

    print('\n')

    my_sales_manager.accommodationList = my_sales_manager\
        .sort_accomodation_by_price(my_sales_manager.accommodationList)
    for accommodation in my_sales_manager.accommodationList:
        print(accommodation.price)