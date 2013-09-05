package org.opencb.variant.lib.io.variant.writers;

import org.opencb.variant.lib.core.formats.VcfRecord;
import org.opencb.variant.lib.io.DataWriter;
import org.opencb.variant.lib.stats.*;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 9/2/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VcfDataWriter extends DataWriter {

    boolean writeVariantStats(List<VcfVariantStat> data);

    boolean writeGlobalStats(VcfGlobalStat globalStats);

    boolean writeSampleStats(VcfSampleStat vcfSampleStat);

    boolean writeSampleGroupStats(VcfSampleGroupStats vcfSampleGroupStats) throws IOException;

    boolean writeVariantGroupStats(VcfVariantGroupStat groupStats) throws IOException;

    boolean writeVariantIndex(List<VcfRecord> data);

}