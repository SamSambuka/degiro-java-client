package cat.indiketa.degiro.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DFavorites implements IValidable {

    private List<DFavorite> data = new ArrayList<>();

    @Override
    public boolean isInvalid() {
        if (data == null) {
            return true;
        }
        for (DFavorite datum : data) {
            if (datum.isInvalid()) {
                return true;
            }
        }
        return false;
    }

}
