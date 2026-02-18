package trabalhojava.buscadordemusicasbrasileiras.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MusicaEntity")
@Getter @Setter
public class SongEntity {

    @Id
    private String id;

    private int deezerId;

    private String deezerLink;

    private String title;

    private String artist;

    private String imageUrl;

    private String previewUrl;
}
