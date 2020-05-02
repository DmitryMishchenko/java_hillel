## OOP (Object-oriented programming)

####Plan: 

* Object class
* Object methods
* toString() method
* Access modifiers (public, protected, default, private)

* abstract classes
* Polymorphism
* Method overriding (@Override annotation)

* Upcasting and downcasting
* instanceof operator


####Task:

1. Реализовать иерархию классов животных
##### классы: 
* Животное, 
* Рыбка, 
* Собака, 
* Кот, 
* Волк, 
* Лев, 
* Жираф, 
* Домашнее, 
* Крокодил, 
* Дикое, 
* Хомяк, 
* Собака-поводырь.
##### поля: 
* id (у всех животных), 
* name (у домашних),  
* age(у всех животных), 
* weight(у всех животных), 
* color(у всех животных), 
* isVaccinated(у домашних), 
* isPredator(у диких), 
* isTrained (дрессированная - у собаки-поводыря).
##### методы:
* public - издать голос (у всех),
* public - отвести домой (у поводыря)
* вспомогательные методы на ваше усмотрение.
2. В приложении, издавать голос следующим образом :
* возвращается строка,
* у всех начинается “Hello, ”,
* если есть имя  “my name is <name>.”
* если дикое “I am a wild animal”
* если хищник “ and I am angry ”
* если собака “Woof”
* если кот “Meow”
* если собака-поводырь и дрессированная “I can take you home.” 
* рыбка отличается от всех ее реплика “....”
3. Узнать что такое diamond problem.
