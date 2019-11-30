package inventory.techiediaries.com.models;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class personne {



    @personne(tableName = "individu")
    public class Individu {
        @PrimaryKey
        @NonNull private Long id;
        private String nom;
        private String prenom;
        private Long numero;
    }
}

