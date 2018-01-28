package entities;

import java.time.LocalDateTime;

/**
 * @author sgdr
 */
public class StrategyProperties {

    private String strategyId;

    private String lastExecution = LocalDateTime.now().toString();

    private String status;

    public StrategyProperties(String strategyId, String status){
        this.status = status;
        this.strategyId = strategyId;
    }

    public String getLastExecution() {
        return lastExecution;
    }

    public String getStatus() {
        return status;
    }

    public String getStrategyId() {
        return strategyId;
    }
}
