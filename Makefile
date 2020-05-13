NO_COLOR=\033[0m
OK_COLOR=\033[0;32m
TS_COLOR=\033[1;30m
TIMESTAMP := $(shell date -u +%Y%m%d%H%M%S)

.PHONY: test
test:
	@echo "$(OK_COLOR)==> Testing$(NO_COLOR)"
	go test -cover -race ./...

.PHONY: clean
clean:
	@echo "$(TS_COLOR)$(TIMESTAMP)$(NO_COLOR)$(OK_COLOR) ==> Cleaning$(NO_COLOR)"
	@go clean
	@rm -f jenkins_jte_golang_app.zip
	@echo "$(TS_COLOR)$(TIMESTAMP)$(NO_COLOR)$(OK_COLOR) ==> Done Cleaning$(NO_COLOR)"

.PHONY: build
build: 
	GOOS=linux go build --ldflags "$(BUILD_DATE) $(GIT_VERSION) $(CI_VERSION)" -o jenkins_jte_golang_app