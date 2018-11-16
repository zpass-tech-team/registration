package io.mosip.registration.processor.scanner.virusscanner.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.processor.core.exception.util.RPRPlatformErrorCodes;

public class VirusScanFailedException extends BaseUncheckedException {

	private static final long serialVersionUID = 1L;

	public VirusScanFailedException(String errorMessage) {
		super(RPRPlatformErrorCodes.RPR_PSJ_VIRUS_SCAN_FAILED, errorMessage);
	}

	public VirusScanFailedException(String message, Throwable cause) {
		super(RPRPlatformErrorCodes.RPR_PSJ_VIRUS_SCAN_FAILED + EMPTY_SPACE, message, cause);
	}

}
