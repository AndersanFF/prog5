package BasePackage;

public class Flat {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long area; //Поле может быть null, Значение поля должно быть больше 0
    private long numberOfRooms; //Значение поля должно быть больше 0
    private int height; //Значение поля должно быть больше 0
    private Boolean next; //Поле может быть null
    private Transport transport; //Поле не может быть null
    private House house; //Поле не может быть null
}
