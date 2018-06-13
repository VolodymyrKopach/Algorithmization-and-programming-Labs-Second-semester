from app import db


class Accommodation(db.Model):
    __tablename__ = "accommodations"
    id = db.Column('id', db.Integer, primary_key=True)
    number_of_rooms = db.Column('number_of_rooms', db.String)
    price = db.Column('price', db.Integer)
    area = db.Column('area', db.Integer)

    def __str__(self):
        return str("id = " + str(self.id) + "\nnumber of rooms = " +
                   str(self.number_of_rooms) + "\nprice = " + str(self.price) + "\narea = " + str(self.area))
