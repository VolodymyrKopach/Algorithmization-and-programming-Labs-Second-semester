from enum import Enum
from app.location import Location


class ListLocationOfSIO(Enum):
    kindergarten = Location(4, 6, 72)
    school = Location(2, 3, 10)
    clinic = Location(9, 12, 34)