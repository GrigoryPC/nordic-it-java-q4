package com.zoo;

import com.zoo.klass.mlekopitayuschie;
import com.zoo.klass.nasekomie;
import com.zoo.klass.paukoobraznie;
import com.zoo.klass.presmykayuschiesya;
import com.zoo.klass.pticy;
import com.zoo.klass.rakoobraznie;
import com.zoo.klass.riby;
import com.zoo.klass.zemnovodnie;

public class zoo {

  public static void main(String[] args) {
    // ZOO. 7 классов животных

    var rakoobraznie = new rakoobraznie();
    rakoobraznie.setName("Крабс");
    rakoobraznie.say();
    rakoobraznie.pawsAvailability("У меня есть лапки");
    rakoobraznie.wayOfMoving();
    rakoobraznie.sredaObitaniya();
    rakoobraznie.pitanie();

    var paukoobraznie = new paukoobraznie();
    paukoobraznie.setName("Черная вдова");
    paukoobraznie.say();
    paukoobraznie.pawsAvailability("У меня есть лапки");
    paukoobraznie.wayOfMoving();
    paukoobraznie.ability();
    paukoobraznie.bite();

    var nasekomie = new nasekomie();
    nasekomie.setName("Муравей");
    nasekomie.say();
    nasekomie.pawsAvailability("У меня есть лапки");
    nasekomie.wayOfMoving();
    nasekomie.color();
    nasekomie.dlina();

    var mlekopitayuschie = new mlekopitayuschie();
    mlekopitayuschie.setName("Человек");
    mlekopitayuschie.say();
    mlekopitayuschie.pawsAvailability("У меня есть ноги");
    mlekopitayuschie.wayOfMoving();
    mlekopitayuschie.pol();
    mlekopitayuschie.vozrast();

    var pticy = new pticy();
    pticy.setName("Ворона");
    pticy.say();
    pticy.pawsAvailability("У меня есть лапки");
    pticy.wayOfMoving();
    pticy.wings();
    pticy.flight();

    var presmykayuschiesya = new presmykayuschiesya();
    presmykayuschiesya.setName("Гадюка");
    presmykayuschiesya.say();
    presmykayuschiesya.pawsAvailability("У меня нет лапок,");
    presmykayuschiesya.wayOfMoving();
    presmykayuschiesya.tail();
    presmykayuschiesya.poison();

    var zemnovodnie = new zemnovodnie();
    zemnovodnie.setName("Лягушка");
    zemnovodnie.say();
    zemnovodnie.pawsAvailability("У меня есть лапки");
    zemnovodnie.wayOfMoving();
    zemnovodnie.food();
    zemnovodnie.birth();

    var riby = new riby();
    riby.setName("Карп");
    riby.say();
    riby.pawsAvailability("У меня нет лапок, но есть плавники)");
    riby.wayOfMoving();
    riby.tell();
    riby.kind();
  }

}
