from flask import request
from app import app
from app import db
from accommodation import Accommodation

from app import ma


class InsuranceStructure(ma.Schema):
    class Meta:
        fields = ('id', 'number_of_rooms', 'price', 'area')


@app.route('/')
def index():
    return '<h1> Ok! </h1>'

@app.route('/accommodations/<id>', methods=['GET'])
def get_accommodation(id):
    find_accommodation = Accommodation.query.get(id)
    if find_accommodation is not None:
        return find_accommodation.__str__()
    else:
        return "Not found"


@app.route('/accommodations', methods=['POST'])
def add_accommodation():
    id = request.json['id']
    number_of_rooms = request.json['number_of_rooms']
    price = request.json['price']
    area = request.json['area']

    new_accommodation = Accommodation
    new_accommodation.id = id
    new_accommodation.number_of_rooms = number_of_rooms
    new_accommodation.price = price
    new_accommodation.area = area

    db.session.add(new_accommodation)
    db.session.commit()

    return 'Ok'


@app.route('/accommodations/<id>', methods=['PUT'])
def update_accommodation(id):
    id = request.json['id']
    number_of_rooms = request.json['number_of_rooms']
    price = request.json['price']
    area = request.json['area']

    new_accommodation = Accommodation.query.get(id)
    new_accommodation.id = id
    new_accommodation.number_of_rooms = number_of_rooms
    new_accommodation.price = price
    new_accommodation.area = area

    db.session.commit()

    return "Ok"


@app.route('/accommodations/<id>', methods=['DELETE'])
def delete_accommodation(id):
    accommodation = Accommodation.query.get(id)
    db.session.delete(accommodation)
    db.session.commit()

    return str("Ok")
