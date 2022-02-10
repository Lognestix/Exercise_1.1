# Введение в Java (Exercise_1.1)
## Домашнее задание по курсу "Java для тестировщиков"
## Тема: «1. Введение в Java», задание №1: «Money Transfer»
# Отчёт о тестировании Money Transfer
## Краткое описание
25.10.2021 было проведено smoke-тестирование приложения Money Transfer.
На тестирование затрачено: 1 (один) час
В результате тестирования выявлены следующие дефекты:
* [описание дефекта](https://github.com/Lognestix/Exercise_1.1/issues/1#issue-1035086429)
## Описание процесса тестирования
В качестве тестовых данных использовались данные VIP-клиента Ксении Глушковой:
* Баланс на момент проведения операции - 2_000_000_000 руб;
* Сумма зачисления денежного перевода - 500_000_000 руб;
* Ожидемый результат, итоговый баланс - 2_500_000_000 руб.
Тестирование производилось в следующем окружении:
* ОС - Windows 7 x64;
* Java - 11.0.12;
* IDE - IntelliJ IDEA.