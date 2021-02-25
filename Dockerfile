FROM maven:3.6.3-openjdk-11

WORKDIR /home/compiler

ADD entrypoint.sh entrypoint.sh
CMD [ "entrypoint.sh" ]
ENTRYPOINT ["sh"]