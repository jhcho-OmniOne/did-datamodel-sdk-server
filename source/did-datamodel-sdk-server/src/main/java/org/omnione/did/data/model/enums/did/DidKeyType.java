/* 
 * Copyright 2024 Raonsecure
 */

package org.omnione.did.data.model.enums.did;

import java.util.EnumSet;

public enum DidKeyType {

	RSA_VERIFICATION_KEY_2018("RsaVerificationKey2018"), 
	SECP256K1_VERIFICATION_KEY_2018("Secp256k1VerificationKey2018"),
	SECP256R1_VERIFICATION_KEY_2018("Secp256r1VerificationKey2018");

	private String rawValue;

	DidKeyType(String rawValue) {
		this.rawValue = rawValue;
	}

	public String getRawValue() {
		return rawValue;
	}

	public static DidKeyType fromString(String rawlavue) {
		for (DidKeyType b : DidKeyType.values()) {
			if (b.rawValue.equalsIgnoreCase(rawlavue)) {
				return b;
			}
		}
		return null;
	}

	public static EnumSet<DidKeyType> all() {
		return EnumSet.allOf(DidKeyType.class);
	}

	public static void main(String[] args) {
		EnumSet<DidKeyType> didKeyTypeEnums = EnumSet.of(DidKeyType.RSA_VERIFICATION_KEY_2018);

		for (DidKeyType didKeyType : didKeyTypeEnums) {
			System.out.println(didKeyType + ": " + didKeyType.getRawValue());
		}
	}
}