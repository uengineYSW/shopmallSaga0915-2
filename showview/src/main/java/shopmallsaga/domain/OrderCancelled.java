package shopmallsaga.domain;

import java.util.*;
import lombok.Data;
import shopmallsaga.infra.AbstractEvent;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
}
