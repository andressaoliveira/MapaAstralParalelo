import java.time.LocalDate;
import java.util.*;

public class BaseDados {
    
    public static final Map<Long, Pessoa> pessoasDB = new HashMap<>();


    static{
        Long id = 0L;
        pessoasDB.put(++id, new Pessoa("Marco", "sp", LocalDate.of(2002, 7, 1)));
        pessoasDB.put(++id, new Pessoa("Rodrigo", "sp", LocalDate.of(2001, 6, 22)));
        pessoasDB.put(++id, new Pessoa("Gustavo Tavares", "sp", LocalDate.of(1998, 1, 28)));
        pessoasDB.put(++id, new Pessoa("Andressa", "bh", LocalDate.of(1995, 5, 25)));
        pessoasDB.put(++id, new Pessoa("Gustavo Roberto", "sp", LocalDate.of(1996, 7, 16)));
    }

}
