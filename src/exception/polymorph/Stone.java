package exception.polymorph;

import java.text.ParseException;

/**
 * Created by green on 31.07.2015.
 *
 * Создание сложных распределенных систем редко обходится без наследова-
 ния и обработки исключений. Следует знать два правила для проверяемых
 исключений при наследовании:
 • переопределяемый метод в подклассе не может содержать в инструкции
 throws исключений, не обрабатываемых в соответствующем методе супер-
 класса;
 • конструктор подкласса должен включить в свой блок throws все классы
 исключений или их суперклассы из блока throws конструктора
 суперкласса,
 к которому он обращается при создании объекта.
 */
public class Stone {
    public void build(String data) throws ParseException, Exception {
/* реализация */
    }
}

