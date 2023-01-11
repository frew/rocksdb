package org.rocksdb;

/**
 * Archival factory. It partitions SST files at the first null byte on manual compactions.
 */
public class SstPartitionerArchivalFactory extends SstPartitionerFactory {
  public SstPartitionerArchivalFactory() {
    super(newSstPartitionerArchivalFactory0());
  }

  private native static long newSstPartitionerArchivalFactory0();

  @Override protected final native void disposeInternal(final long handle);
}
