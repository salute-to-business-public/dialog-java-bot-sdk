package im.dlg.botsdk;

import com.google.common.collect.Sets;
import dialog.Miscellaneous;

import java.util.Set;

class RequestsDefaults {
    static Set<Miscellaneous.UpdateOptimization> optimizations = Sets.newHashSet(
            Miscellaneous.UpdateOptimization.UPDATEOPTIMIZATION_STRIP_ENTITIES,
            Miscellaneous.UpdateOptimization.UPDATEOPTIMIZATION_STRIP_ENTITIES_V2,
            Miscellaneous.UpdateOptimization.UPDATEOPTIMIZATION_STRIP_COUNTERS,
            Miscellaneous.UpdateOptimization.UPDATEOPTIMIZATION_COMPACT_USERS
    );
}
