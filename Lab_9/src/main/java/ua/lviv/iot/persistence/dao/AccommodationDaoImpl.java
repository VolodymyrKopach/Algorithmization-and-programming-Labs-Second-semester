package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Accommodation;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class AccommodationDaoImpl extends AbstractDao<Accommodation> implements AccommodationDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Accommodation> getEntityClass() {
            return Accommodation.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


