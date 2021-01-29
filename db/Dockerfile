FROM postgres:9.6

ADD dbData.sql /docker-entrypoint-initdb.d

EXPOSE 5432
CMD ["postgres"]