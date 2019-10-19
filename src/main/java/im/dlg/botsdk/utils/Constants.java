package im.dlg.botsdk.utils;

import com.google.common.collect.Sets;
import dialog.Miscellaneous;

import java.util.Set;

public class Constants {
    /**
     * The collection of regular optimisations for request
     */
    public static final Set<Miscellaneous.UpdateOptimization> OPTIMISATIONS = Sets.newHashSet(
            Miscellaneous.UpdateOptimization.UPDATEOPTIMIZATION_STRIP_ENTITIES);
}
