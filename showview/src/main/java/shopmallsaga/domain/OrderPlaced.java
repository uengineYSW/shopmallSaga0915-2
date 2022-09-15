package shopmallsaga.domain;

import java.util.*;
import lombok.Data;
import shopmallsaga.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
}
