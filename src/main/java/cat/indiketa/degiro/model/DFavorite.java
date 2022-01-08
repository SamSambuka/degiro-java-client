package cat.indiketa.degiro.model;

import lombok.*;

import java.util.ArrayList;

@Data
public class DFavorite implements IValidable {


    public long id;
    public boolean isDefault;
    public String name;
    public String[] productIds;

    @Override
    public boolean isInvalid() {
        return id == 0 || productIds == null;
    }
}
