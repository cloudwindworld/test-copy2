package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;

import org.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed64x72 extends Ufixed {
  public static final Ufixed64x72 DEFAULT = new Ufixed64x72(BigInteger.ZERO);

  public Ufixed64x72(BigInteger value) {
    super(64, 72, value);
  }

  public Ufixed64x72(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
    super(64, 72, m, n);
  }
}
