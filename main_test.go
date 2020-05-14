package main

import "testing"

func TestHello(t *testing.T) {
	if got := Hello(); got == "" {
		t.Errorf("Hello() returned empty string")
	}
}
