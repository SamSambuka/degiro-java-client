package cat.indiketa.degiro.model.updates;

import cat.indiketa.degiro.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


/**
 * Represent update received from the network.
 */
@Data
@AllArgsConstructor
public class DUpdates {
    List<DUpdateToken> tokens;
    /**
     * On first update request with token == 0 contain all open orders.
     */
    DLastUpdate<List<DUpdate<DOrder>>> orders;
    /**
     * On first update request with token == 0 contain all portfolio entries.
     */
    DLastUpdate<List<DUpdate<DPortfolioProduct>>> portfolio;
    /**
     * On first update request with token == 0 is empty
     */
    DLastUpdate<List<DUpdate<DHistoricalOrder>>> historicalOrders;
    /**
     * On first update request with token == 0 contain all portfolio summary entries.
     */
    DLastUpdate<DUpdate<DPortfolioSummary>> portfolioSummary;
    /**
     * On first update request with token == 0 contain all active alerts.
     */
    DLastUpdate<List<DUpdate<DAlert>>> alerts;
    /**
     * On first update request with token == 0 contain existing cash funds.
     */
    DLastUpdate<List<DUpdate<DCashFund>>> cashFunds;
    /**
     * On first update request with token == 0 is empty
     */
    DLastUpdate<List<DUpdate<DLastTransaction>>> transactions;

    DLastUpdate<List<DUpdate<DFavourites>>> favourites;

}

