package cat.indiketa.degiro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class DFavourites extends ArrayList<Long> implements IValidable, DCopyable<DFavourites> {

    public long id;
    public boolean isDefault;
    public long[] productIds;


    @Override
    public boolean isInvalid() {
        return id == 0 || productIds == null;
    }

    @Override
    public DFavourites copy() {
        return null;
    }
}
